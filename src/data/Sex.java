package data;

public enum Sex {
    MAN {
        @Override
        public String toString() {
            return "男";
        }
    },
    WOMAN {
        @Override
        public String toString() {
            return "女";
        }
    }
}
