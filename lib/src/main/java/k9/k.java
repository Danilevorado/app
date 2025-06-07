package k9;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes2.dex */
public abstract class k extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(512, 512);
    }
}
