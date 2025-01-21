public class Demo022 {
    public static void main(String[] args) {
                String[] friendsNames = {"Saiteja", "Sravan", "Charan", "Shivani", "Deepika"};
                long[] friendsPhones = {1234567891L, 1234567895L, 1234567896L, 1234567894L, 1234567898L};
                System.out.println("My friends' names and their phone numbers are:");
                for (int i = 0; i < friendsNames.length; i++) {
                    System.out.println("Friend's name: " + friendsNames[i] + ", Phone number: " + friendsPhones[i]);
                    
                }
            }
        }