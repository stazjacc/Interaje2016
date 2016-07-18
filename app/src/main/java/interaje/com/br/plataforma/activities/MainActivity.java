package interaje.com.br.plataforma.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import interaje.com.br.plataforma.R;
import interaje.com.br.plataforma.adapter.NewsAdapter;
import interaje.com.br.plataforma.utils.FakeNews;

public class MainActivity extends AppCompatActivity {

    ListView newsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsListView = (ListView) findViewById(R.id.mainActivity_newsList);
        NewsAdapter adapter = new NewsAdapter(FakeNews.getFakeList(), MainActivity.this);
        newsListView.setAdapter(adapter);


        newsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clicou "+ position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
