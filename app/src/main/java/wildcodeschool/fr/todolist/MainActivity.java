package wildcodeschool.fr.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Todo car = new Todo("Récupérer ma voiture", new GregorianCalendar(2019, 0, 1).getTime());
        Todo vacuum = new Todo("Passer l'aspirateur", new GregorianCalendar(2019, 0, 3).getTime());
        Todo tacos = new Todo("Acheter des tacos", new GregorianCalendar(2019, 1, 6).getTime());
        List<Todo> todos = Arrays.asList(car, vacuum, tacos);

        ListView listTodo = findViewById(R.id.listTodos);
        TodoAdapter adapter = new TodoAdapter(MainActivity.this, todos);
        listTodo.setAdapter(adapter);
    }
}
