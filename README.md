# TV-HorizontalListView
Custom Horizontal ListView for TV apps,more suitable for remote control operation.

---

Impression
===

![演示效果](https://raw.githubusercontent.com/Ryfthink/TV-HorizontalListView/master/art/impress.gif)

XML attributes
===
    <declare-styleable name="HListView">
        <!--item高度-->
        <attr name="item_height" format="dimension"/>
        <!--item宽度-->
        <attr name="item_width" format="dimension"/>
        <!--item获得焦点后缩放因子-->
        <attr name="item_scale_factor" format="float"/>
        <!--缩放动画持续时间-->
        <attr name="item_scale_duration" format="integer"/>
        <!--item之间的间距-->
        <attr name="spacing" format="dimension"/>
        <!--控件滚动到最左侧溢出范围-->
        <attr name="left_offset" format="dimension"/>
        <!--控件滚动到最右侧溢出范围-->
        <attr name="right_offset" format="dimension"/>
        <!--item相对于HListView的Gravity-->
        <attr name="gravity" format="enum">
            <enum name="top" value="0"/>
            <enum name="center" value="1"/>
            <enum name="bottom" value="2"/>
        </attr>
        <attr name="bg_color" format="color"/>
    </declare-styleable>


Usage
===

styles.xml

    <attr name="HListViewStyle" format="reference"/>
    <style name="HListViewStyle">
        <item name="android:layout_width">match_parent</item>
        <item name="android:layout_height">300dp</item>
        <!-- not namespace prefix -->
        <item name="item_width">200dp</item>
        <item name="item_height">200dp</item>
        <item name="spacing">20dp</item>
        <item name="gravity">center</item>
        <item name="left_offset">130dp</item>
        <item name="right_offset">130dp</item>
    </style>
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        ...
        <item name="HListViewStyle">@style/HListViewStyle</item>
    </style>

main_layout.xml
 
    <?xml version="1.0" encoding="utf-8"?>
    <LinearLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <cn.septenary.widget.HListView
            android:id="@+id/list_view"
            style="?HListViewStyle">
        </cn.septenary.widget.HListView>

    </LinearLayout>




