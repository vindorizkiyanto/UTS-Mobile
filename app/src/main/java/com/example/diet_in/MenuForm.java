package com.example.diet_in;

import android.app.Activity;
import android.widget.Button;
import android.os.Bundle;

public class MenuForm {

    private Activity activity;
    private Button buttonMenu;
    private Button btnInfo;
    private Button btnExit;

    public MenuForm(Activity activity){
        this.activity = activity;
        btnExit = (Button) activity.findViewById(R.id.keluar);
        buttonMenu = (Button) activity.findViewById(R.id.main_buttonMenu);
        btnInfo = (Button) activity.findViewById(R.id.btnInfoaplikasi);
    }

    public Activity getActivity(){
        return activity;
    }
    public Button getButtonMenu(){
        return buttonMenu;
    }
    public Button getBtnInfo(){
        return btnInfo;
    }
    public Button getBtnExit(){
        return btnExit;
    }

}