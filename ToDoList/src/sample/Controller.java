package sample;

import sample.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;

    public void initialize() {
        TodoItem item1 = new TodoItem("Mail anniversary card", "Bye a card for Him",
                LocalDate.of(2021, Month.APRIL, 20));

        TodoItem item2 = new TodoItem("Doctors appointment", "Bye a card for Him",
                LocalDate.of(2021, Month.MAY, 20));

        TodoItem item3 = new TodoItem("Mail anniversary card", "Bye a card for Him",
                LocalDate.of(2021, Month.NOVEMBER, 20));

        TodoItem item4 = new TodoItem("Mail anniversary card", "Bye a card for Him",
                LocalDate.of(2021, Month.JANUARY, 20));

        TodoItem item5 = new TodoItem("Mail anniversary card", "Bye a card for Him",
                LocalDate.of(2021, Month.JULY, 20));

        todoItems = new ArrayList<>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
    }
}
