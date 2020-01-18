package com.taleb.fontview

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.EditText

open class FontEditText : EditText {

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context, attrs)
    }

    private fun init(context: Context, attributeSet: AttributeSet?) {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.FontinatorView)
        try {
            val fontSrc = typedArray.getString(R.styleable.FontinatorView_font_asset_src)
            typeface = Typeface.createFromAsset(context.assets, fontSrc)
        } catch (ex: Exception) {
        } finally {
            typedArray.recycle()
        }
    }
}