// Generated code from Butter Knife. Do not modify!
package com.canplay.milk.mvp.activity.account;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.canplay.medical.R;
import com.canplay.milk.view.ClearEditText;
import com.canplay.milk.view.NavigationBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChangePhoneActivity_ViewBinding implements Unbinder {
  private ChangePhoneActivity target;

  @UiThread
  public ChangePhoneActivity_ViewBinding(ChangePhoneActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChangePhoneActivity_ViewBinding(ChangePhoneActivity target, View source) {
    this.target = target;

    target.line = Utils.findRequiredView(source, R.id.line, "field 'line'");
    target.navigationBar = Utils.findRequiredViewAsType(source, R.id.navigationBar, "field 'navigationBar'", NavigationBar.class);
    target.etPhone = Utils.findRequiredViewAsType(source, R.id.et_phone, "field 'etPhone'", ClearEditText.class);
    target.tvGetcode = Utils.findRequiredViewAsType(source, R.id.tv_getcode, "field 'tvGetcode'", TextView.class);
    target.etCode = Utils.findRequiredViewAsType(source, R.id.et_code, "field 'etCode'", ClearEditText.class);
    target.tvLogin = Utils.findRequiredViewAsType(source, R.id.tv_login, "field 'tvLogin'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChangePhoneActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.line = null;
    target.navigationBar = null;
    target.etPhone = null;
    target.tvGetcode = null;
    target.etCode = null;
    target.tvLogin = null;
  }
}
