package com.urbanclap.loki.theme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;

import android.text.TextUtils;
import android.util.AttributeSet;

import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

import com.urbanclap.loki.LokiConfig;
import com.urbanclap.loki.R;


public class UCTextView extends AppCompatTextView {

    public UCTextView(Context context) {
        super(context);
        init(null);
    }

    public UCTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public UCTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray ta = getContext().obtainStyledAttributes(attrs, R.styleable.UCTextView);
        int textStyle = ta.getInt(R.styleable.UCTextView_loki_textStyle,0);
        String textType = ta.getString(R.styleable.UCTextView_loki_textType);
        ta.recycle();
        setFontFamily(textStyle);

    }

    public void setFontFamily(int textStyle) {
        String fontFamilyResourceId;
        int[] styleAttrs = new int[1];
        switch (textStyle){
            case 0 :
                 styleAttrs[0]= R.attr.loki_fontFamily_regular;
             break;

            case 1 :
                styleAttrs[0]= R.attr.loki_fontFamily_medium;
                break;

            case 2 :
                styleAttrs[0]= R.attr.loki_fontFamily_bold;
                break;

            default:
                styleAttrs[0]= R.attr.loki_fontFamily_regular;

        }
        TypedArray styleTa = getContext().obtainStyledAttributes(LokiConfig.getInstance().getLokiCustomTheme(), styleAttrs);
        fontFamilyResourceId = styleTa.getString(0);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),fontFamilyResourceId);
        setTypeface(typeface);
        styleTa.recycle();
    }
}
