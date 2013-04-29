package br.gov.mi.principal;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PrincipalBean extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {		
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}

}
