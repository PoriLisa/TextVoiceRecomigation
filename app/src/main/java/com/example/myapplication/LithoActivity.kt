package com.example.myapplication

import android.app.LauncherActivity
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.litho.Column
import com.facebook.litho.Component
import com.facebook.litho.ComponentContext
import com.facebook.litho.LithoView
import com.facebook.litho.annotations.OnCreateLayout
import com.facebook.litho.annotations.Prop
import com.facebook.litho.widget.Text
import com.facebook.soloader.SoLoader
import com.facebook.yoga.YogaEdge
import java.util.logging.Level.ALL


class LithoActivity : AppCompatActivity() {

    lateinit var c: ComponentContext

    // var component: Component = LauncherActivity.ListItem.create(c).build();
    lateinit var component: Component




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_litho)
        SoLoader.init(this, false);
        c = ComponentContext(this);
       // component = this.onCreateLayout(c,  "text", "text4")!!


       // onCreateLayout(c, R.color.colorAccent, "text", "text4")

        /* component = Text.create(c)
             .text("Hello World")
             .textSizeDip(50F)
             .build();

         setContentView(LithoView.create(c, component));
 */
       // setContentView(LithoView.create(c, component));
    }


  /*  @OnCreateLayout
    fun onCreateLayout(
        c: ComponentContext?,
        @Prop title: String?,
        @Prop subtitle: String?
    ): Component? {
        return Column.create(c)
            .paddingDip(YogaEdge.ALL, 16f)
            .child(
                Text.create(c)
                    .text(title)
                    .textSizeSp(40f)
            )
            .child(
                Text.create(c)
                    .text(subtitle)
                    .textSizeSp(20f)
            )
            .build()
    }*/

}

object ListItemSpec {
    @OnCreateLayout
    fun onCreateLayout(c: ComponentContext?): Component {
        return Column.create(c)
            .paddingDip(YogaEdge.ALL, 16f)
            .backgroundColor(Color.WHITE)
            .child(
                Text.create(c)
                    .text("Hello world")
                    .textSizeSp(40f)
            )
            .child(
                Text.create(c)
                    .text("Litho tutorial")
                    .textSizeSp(20f)
            )
            .build()
    }
}
