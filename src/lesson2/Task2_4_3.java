package lesson2;

public class Task2_4_3 {

    public static void main(String[] args) {
        String[] roles = new String[] {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"
        };

        String[] text = new String[] {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };

        Task2_4_3 task243 = new Task2_4_3();
        String text1 = task243.printTextPerRole(roles, text);
        String text2 = "Городничий:\n" +
                "1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.\n" +
                "4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.\n" +
                "\n" +
                "Аммос Федорович:\n" +
                "2) Как ревизор?\n" +
                "5) Вот те на!\n" +
                "\n" +
                "Артемий Филиппович:\n" +
                "3) Как ревизор?\n" +
                "6) Вот не было заботы, так подай!\n" +
                "\n" +
                "Лука Лукич:\n" +
                "7) Господи боже! еще и с секретным предписаньем!\n\n";

        System.out.println(text1.equals(text2));
//        System.out.println(text1);
//        System.out.println();
//        System.out.println(text2);

        for (int i = 0; i < text1.length(); i++) {
            char c1 = text1.charAt(i);
            char c2 = text2.charAt(i);
            if (c1 != c2) System.out.println(c1 + " " + c2 + " " + i);
        }

    }

    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder builder = new StringBuilder();

        for (String role : roles ) {
            builder.append(role).append(":" + '\n');
            for (int i = 0; i < textLines.length; i++) {
                int index = textLines[i].indexOf(":");
                String name = textLines[i].substring(0, textLines[i].indexOf(":"));
                if (name.equals(role) ){
                    builder.append(i+1).append(")").append(textLines[i].substring(index+1, textLines[i].length())).append('\n');

                }
            }
            builder.append('\n');
        }

        return builder.toString();
    }
}
