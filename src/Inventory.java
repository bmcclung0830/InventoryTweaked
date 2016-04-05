public class Inventory {

        public static void main(String[] args) {

            while (true) {
                Login.login();
                Menu.menu();
                while (! Menu.getChoice().equalsIgnoreCase("5")) {
                    Menu.menu();
                }
            }
        }
    }

