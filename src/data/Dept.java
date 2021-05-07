package data;

public enum Dept {
    SOFTWARE {
        @Override
        public String toString() {
            return "软件专业";
        }
    },
    HARDWARE {
        @Override
        public String toString() {
            return "硬件专业";
        }
    }
}
