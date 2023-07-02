// *Получить исходную json строку из файла, используя FileReader или Scanner
// Дана json строка вида:
// String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
// "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
// "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

// Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

// Используйте StringBuilder для подготовки ответа. Далее создайте метод, который запишет
// результат работы в файл. Обработайте исключения и запишите ошибки в лог файл с помощью Logger.

package hw_2;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Logger;


public class j1 {
  public static void main(String[] args) {
    String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"2\",\"предмет\":\"Математика\"}," +
            "{\"фамилия\":\"Петрова\",\"оценка\":\"2\",\"предмет\":\"Информатика\"}," +
            "{\"фамилия\":\"Краснов\",\"оценка\":\"2\",\"предмет\":\"Физика\"}]";
    String[] arr = pars_str(json);
    String[] new_arr = print_status(arr);
    write_file(new_arr);
}

static String[] pars_str(String my_str) {
    // Эта функция убирает лишнее из данной строки и возвращает список из пар значений
    String[] arr = my_str.split(",");
    arr[0] = arr[0].replace("[", "");
    arr[arr.length - 1] = arr[arr.length - 1].replace("]", "");
    for (int item = 0; item < arr.length; item++) {
        arr[item] = arr[item].replace("{", "");
        arr[item] = arr[item].replace("}", "");
        arr[item] = arr[item].replace("\"", "");
    }
    return arr;
}

static String[] print_status(String[] arr) {
    // Эта функция вывод строки по требованию задачи и создаёт массив из этих строк
    Map<String, String> my_dict = new HashMap<String, String>();
    StringBuilder my_str = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
        String[] new_arr = arr[i].split(":");
        my_dict.put(new_arr[0], new_arr[1]);
        if ((i + 1) % 3 == 0) {
            System.out.println("Студент " + my_dict.get("фамилия") + " получил " +
                    my_dict.get("оценка") + " по предмету " + my_dict.get("предмет"));
            my_str.append("Студент " + my_dict.get("фамилия") + " получил " +
                    my_dict.get("оценка") + " по предмету " + my_dict.get("предмет") + ":");
            my_dict = new HashMap<String, String>();
        }
    }
    String[] arr_1 = my_str.toString().split(":");
    return arr_1;
}

static void write_file(String[] arr) {
    Logger logger = Logger.getAnonymousLogger();
    FileHandler fileHandler = null;
    try {
        fileHandler = new FileHandler("err.txt");
        logger.addHandler(fileHandler);
    }catch (IOException e){
        e.printStackTrace();
    }

    try (FileWriter writer = new FileWriter("text.txt", false)) {
        for (int i = 0; i < arr.length; i++) {
            String text = arr[i];
            writer.write(text);
            writer.write("\n");
        }
        writer.flush();
    } catch (Exception e) {
        logger.warning("Произошла ошибка (");
    }
}
}
