package nikhita.com.animation;

import android.animation.AnimatorSet;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
public class MainActivity extends Activity {
    AnimatorSet set;
    protected void onCreate(Bundle savedInstanceState) {
        //TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
       /* public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

    public void rotate1(View view) {
       // set.start();

        startActivity(new Intent(this, NewActivity.class));

//Set the transition -> method available from Android 2.0 and beyond
        overridePendingTransition(R.anim.rotate_out,R.anim.rotate_in);

    }



     /*  public void onStart ()
        {
            super.onStart();
            ImageView imgView = (ImageView) findViewById(R.id.imageview);
            ImageView imgView2 = (ImageView) findViewById(R.id.imageview2);

            set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.flip);
            set.setTarget(imgView);
          //  imgView2.setEnabled(true);
//imgView2.setImageDrawable(drawable a);
        }
*/
}