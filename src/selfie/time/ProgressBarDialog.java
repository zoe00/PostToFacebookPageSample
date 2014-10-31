package selfie.time;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

public final class ProgressBarDialog
{
	private Dialog m_dialog = null;
	Context context;

	String msg="";

	public ProgressBarDialog(Context contx, String message)
	{
		context= contx;
		msg=message;

		m_dialog = new Dialog(context, android.R.style.Theme_NoTitleBar_Fullscreen);

		Drawable d = new ColorDrawable(Color.BLACK);
		d.setAlpha(215);

		m_dialog.getWindow().setBackgroundDrawable(d);
		m_dialog.setContentView(R.layout.opacity_layer);

		TextView progressText = (TextView)m_dialog.findViewById(R.id.ProgressMessage);
		progressText.setText("Cruising...");
	}

	public void show()
	{
		m_dialog.show();
		m_dialog.setCancelable(false);
	}

	public void dismiss()
	{
		if(m_dialog != null)
		{
			if(m_dialog.isShowing())
				m_dialog.dismiss();
		}
	}

}