package interaje.com.br.plataforma.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import interaje.com.br.plataforma.R;
import interaje.com.br.plataforma.models.News;

/**
 * Created by JACC on 13/07/2016.
 */
public class NewsAdapter extends BaseAdapter {

    private List<News> newsList;
    private Context context;
    private LayoutInflater layoutInflater;

    public NewsAdapter(List<News> newsList, Context context){

        this.newsList = newsList;
        this.context = context;
        layoutInflater = layoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return newsList.size();
    }

    @Override
    public Object getItem(int position) {
        return newsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return newsList.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View item = layoutInflater.inflate(R.layout.item_news_list, viewGroup, false);

        News news = newsList.get(position);

        TextView author = (TextView) item.findViewById(R.id.item_layout_author);
        TextView title  = (TextView) item.findViewById(R.id.item_layout_title);
        TextView course = (TextView) item.findViewById(R.id.item_layout_course);

        author.setText(news.getAuthor());
        title.setText(news.getTitle());
        course.setText(news.getCourse());

        return item;
    }
}
