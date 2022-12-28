package temple.ground.virtualflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    /*  Two Grains
        1.  xml  Create textview, textAlign to center, 80 sp, bold.
        2.  xml  Create below it nested frame layout.
        3.  xml  Create two buttons with '<' and '>', 150 dp width.
        4.  xml  Extract button labels to string resources.
        5.  xml  Add id's to view elements.
        6.  kt   Create class fields for view elements.
        7.  kt   Bind all views to class fields with method findViews().
        8.  kt   Create static constant for starter number.
        9.  kt   Setup listeners for buttons and starter text in setupViews().
        10. kt   Create extension function for TextView to increment/decrement.
        11. kt   Buttons should increment / decrement number in textview.
        12. AS   Choose proper build variant, run build and launch in emulator.
     */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}