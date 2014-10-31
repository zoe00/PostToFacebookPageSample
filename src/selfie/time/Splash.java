package selfie.time;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); 
		setContentView(R.layout.splash);
		final Typeface mFont = Typeface.createFromAsset(getAssets(), "bg.otf");
		final ViewGroup mContainer = (ViewGroup) findViewById(
				android.R.id.content).getRootView();
		Util.setAppFont(mContainer, mFont, false);
		new SplashTask().execute();	
	}

	private class SplashTask extends AsyncTask<Void, Void, Void>{
		@Override
		protected void onPreExecute() {
		}

		@Override
		protected Void doInBackground(Void... params) {			
			try {
				Thread.sleep(1600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return null;

		}
		@Override
		protected void onPostExecute(Void result) {
			Intent intent;
			intent = new Intent(Splash.this, HelloFacebookSampleActivity.class);
			startActivity(intent);
			finish();
		}				 
	}

}
