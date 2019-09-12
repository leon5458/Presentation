package com.example.presentation;
import android.app.Presentation;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
public class ScreenPresentation extends Presentation {
    private Context context;

    public ScreenPresentation(Context outerContext, Display display) {
        super(outerContext, display);
        this.context = outerContext;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_layout);
    }

}
