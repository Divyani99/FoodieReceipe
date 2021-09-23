package com.example.homep1;

import android.os.Bundle;

import java.util.Vector;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FoodieVideo extends AppCompatActivity {
    public RecyclerView recyclerView;
    Vector <YoutubeVideos>youtubeVideos=new Vector<>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodievideo);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/E3W4aWlOjNY\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/TAuAtgGexYM\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qhxfQauW4Y\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BOPMHQcHk1w\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/jzQTMS-6hxs\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/dGd6GTNMOP8\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ j_3DG7eHyXA \" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ SRbr7BsvmsY\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ uKUvtyjw8R0\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ nKAdXwXOmW4\" frameborder=\"0\" allowfullscreen></frame>"));


        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ zQrbVqwoUrs\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/2DirEw0Z4cg\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/2zx9ej9R4Sc\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ ef_9Hmizlqc\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ MXuw6YAG0k\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ 7YglkkaFA\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ p3PCN09H\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/_HfJ3OCiH0\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ 7lYROIL7qu\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ zsBTjHNCE88\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/7YglkkaFA\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ p3PCN09Hg\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ _HfJ3OCiH0\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ 7lYROIL7quk\" frameborder=\"0\" allowfullscreen></frame>"));



        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ zsBTjHNCE88\" frameborder=\"0\" allowfullscreen></frame>"));

        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ v2nudF5_15k\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ dl532yGfItI\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ oeJT_eFJ14g\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ 1ETGMW0id5A\" frameborder=\"0\" allowfullscreen></frame>"));
        youtubeVideos.add(new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ HKqs6k5PaCo\" frameborder=\"0\" allowfullscreen></frame>"));

   VideoAdapter videoAdapter=new VideoAdapter(youtubeVideos);
   recyclerView.setAdapter(videoAdapter);
recyclerView.addItemDecoration(new VerticalSpace(50));
    }



}
