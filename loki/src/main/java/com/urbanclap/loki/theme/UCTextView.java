package com.urbanclap.loki.theme;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;

import android.text.TextUtils;
import android.util.AttributeSet;

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
        String fontFamily = ta.getString(R.styleable.UCTextView_fontFamily);
        String parsedText = ta.getString(R.styleable.UCTextView_parsedText);
        ta.recycle();

        /*if (isInEditMode()) {
            FontCacheUtils.init(getContext());
        }
        if (TextUtils.isEmpty(fontFamily)) {
            fontFamily = FontCacheUtils.TYPE_REGULAR;
        }
        setFontFamily(fontFamily);
        if(!TextUtils.isEmpty(parsedText)){
            setText(NameParser.getParsedString(parsedText));
        }*/



        int[] styleAttrs = {R.attr.fontFamily, android.R.attr.text};
        TypedArray styleTa = getContext().obtainStyledAttributes(LokiConfig.getInstance().getLokiCustomTheme(), styleAttrs);
        String fontFamilyResourceId = ta.getString(0);
        setFontFamily(fontFamilyResourceId);
        styleTa.recycle();
    }

    public void setFontFamily(String fontFamilyResourceId) {
        //Typeface typeface = ResourcesCompat.getFont(getContext(),fontFamilyResourceId);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),fontFamilyResourceId);
        setTypeface(typeface);
    }

    public void setDefaultTypeface() {
        setTypeface(null);
    }
}
