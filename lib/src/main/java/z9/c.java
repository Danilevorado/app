package z9;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes2.dex */
class c implements b {
    c() {
    }

    private void b(Bundle bundle) {
        String strD = c9.a.a().d();
        Intent intent = new Intent();
        intent.setAction(strD + ".action.SILENT_PUSH_RECEIVE");
        intent.putExtras(bundle);
        intent.putExtra("pw_data_json_string", g8.e.h(bundle).toString());
        c9.a.i().a(intent, j9.b.d().g(strD));
    }

    @Override // z9.b
    public boolean a(Bundle bundle) {
        if (g8.e.d(bundle)) {
            b(bundle);
        }
        g8.e.i(bundle, w7.a.g());
        return false;
    }
}
