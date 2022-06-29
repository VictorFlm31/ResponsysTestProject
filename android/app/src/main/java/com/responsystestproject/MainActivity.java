package br.com.redeipiranga.debug;

import com.facebook.react.ReactActivity;
import android.os.Bundle;
import com.pushio.manager.PushIOManager;

public class MainActivity extends ReactActivity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // The following line initializes the SDK, ensures that any registration changes are reflected with Responsys,
    // and sets up users to receive push notifications
    PushIOManager.getInstance(getApplicationContext()).registerApp();
  }

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "ResponsysTestProject";
  }
}
