package com.example.presentation;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;

public class MainActivity extends AppCompatActivity {
    private ScreenPresentation screenPresentation;
    private DisplayManager displayManager;//屏幕管理器
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVideo();
    }
    private void initVideo() {
        if (displayManager == null) {
            displayManager = (DisplayManager) getSystemService(Context.DISPLAY_SERVICE);
            Display[] displays = displayManager.getDisplays();//获取窗口
            if (displays.length > 1) {
                screenPresentation = new ScreenPresentation(MainActivity.this, displays[1]);// displays[1]是副屏
                screenPresentation.show();//显示
            }
        }
    }
}
