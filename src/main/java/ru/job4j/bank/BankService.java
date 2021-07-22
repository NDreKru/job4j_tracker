package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает систему управления счетами пользователя
 * @author Andrey Kruglov
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение пользователей и их счетов осуществляется в коллекции HashMap,
     * где ключом выступает пользователь, а соответствующим ему
     * значением - список ArrayList счетов пользователя
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и при отсутствии такого пользователя
     * добавляет его в коллекцию всех пользователей
     * @param user добавляемый пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет счет пользователю с заданным номером паспорта
     * @param passport - номер паспорта пользователя, которому нужно добавить счет
     * @param account - добавляемый счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод ищет пользователя с заданным номером паспорта
     * @param passport номер паспорта искомого пользователя
     * @return пользователь с данным номером паспорта, если пользователь не найден - возвращает null
     */
    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод принимает на вход номер паспорта пользователя, реквизиты счета.
     * Сперва осуществляется поиск пользователя по номеру паспорта,
     * далее, если пользователь найден, в списке счетов пользователя осуществляется
     * поиск счета по реквизитам
     * @param passport номер паспорта пользователя
     * @param requisite реквизиты искомого счета
     * @return счет пользователя, если счет не найден, возвращает null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод осуществляет перевод средств со счета одного пользователя на счет другого пользователя.
     * Принимает на вход номер паспорта отправителя и реквизиты исходного счета, номер паспорта
     * получателя и реквизиты исходного счета, количество переводимых средств. По реквизитам
     * осуществляется поиск счета отправителя и поиск счета получателя. Если счета найдены и сумма
     * средств на балансе счета отправителя позволяет осуществить перевод средств, то операция
     * осуществляется и метод возвращает true, иначе метод возвращает false
     * @param srcPassport номер паспорта отправителя
     * @param srcRequisite реквизиты счета отправителя
     * @param destPassport номер паспорта получателя
     * @param destRequisite реквизиты счета получателя
     * @param amount количество переводимых средств
     * @return true если операция успешно завершена, false неудачное завешение операции
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc != null && destAcc != null && srcAcc.getBalance() >= amount) {
            srcAcc.setBalance(srcAcc.getBalance() - amount);
            destAcc.setBalance(destAcc.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
