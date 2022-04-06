package com.example.vavaregex;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloController {
    @FXML
    public TextField tfStr, tfRegex;
    public TextArea taResult;
    public CheckBox cbCase;

    @FXML
    protected void onFindButtonClick()
    {
        String str = tfStr.getText();
        String regex = tfRegex.getText();

        Pattern pattern;

        if (cbCase.isSelected()) pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        else pattern = Pattern.compile(regex);

        if (pattern.matcher(str).find()) taResult.setText("OK");
        else taResult.setText("NG");
    }
}