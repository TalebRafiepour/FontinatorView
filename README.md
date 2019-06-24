# FontinatorView
a simple library for adding custom fonts in views On Android

```
dependencies {
	        implementation 'com.github.TalebRafiepour:FontinatorView:0.5'
	}
	
	
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

### Sample

```
<com.taleb.fontview.FontTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="top|center"
        android:textColor="@android:color/black"
        android:textSize="18dp"
        android:background="@android:color/holo_blue_bright"
        app:font_asset_src="fonts/IRANSansFaNum.ttf"
        android:text=" تکست ویو"/>
