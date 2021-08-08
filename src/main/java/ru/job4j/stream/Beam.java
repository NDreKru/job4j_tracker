package ru.job4j.stream;

public class Beam {
    private String profile;
    private String material;
    private int detailNumber;
    private int assemblyNumber;
    private String prefix;
    private int color;

    static class Builder {
        private String profile;
        private String material;
        private int detailNumber;
        private int assemblyNumber;
        private String prefix;
        private int color;

        Builder buildProfile(String profile) {
            this.profile = profile;
            return this;
        }

        Builder buildMaterial(String material) {
            this.material = material;
            return this;
        }

        Builder buildDetailNumber(int detailNumber) {
            this.detailNumber = detailNumber;
            return this;
        }

        Builder buildAssemblyNumber(int assemblyNumber) {
            this.assemblyNumber = assemblyNumber;
            return this;
        }

        Builder buildPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        Builder buildColor(int color) {
            this.color = color;
            return this;
        }

        Beam build() {
            Beam beam = new Beam();
            beam.profile = profile;
            beam.material = material;
            beam.detailNumber = detailNumber;
            beam.assemblyNumber = assemblyNumber;
            beam.prefix = prefix;
            beam.color = color;
            return beam;
        }
    }

    @Override
    public String toString() {
        return "Beam{"
                + "profile='" + profile + '\''
                + ", material='" + material + '\''
                + ", detailNumber=" + detailNumber
                + ", assemblyNumber=" + assemblyNumber
                + ", prefix='" + prefix + '\''
                + ", color=" + color + '}';
    }

    public static void main(String[] args) {
        Beam beam = new Builder().buildProfile("[14П")
                .buildMaterial("C345")
                .buildDetailNumber(1)
                .buildAssemblyNumber(1)
                .buildPrefix("Б")
                .buildColor(5)
                .build();
        System.out.println(beam);
    }
}
