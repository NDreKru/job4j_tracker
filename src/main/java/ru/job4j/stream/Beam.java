package ru.job4j.stream;

public class Beam {
    private String profile;
    private String material;
    private int detailNumber;
    private int assemblyNumber;
    private String prefix;
    private byte color;

    static class Builder {
        private String profile;
        private String material;
        private int detailNumber;
        private int assemblyNumber;
        private String prefix;
        private byte color;

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

        Builder buildColor(byte color) {
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
}
