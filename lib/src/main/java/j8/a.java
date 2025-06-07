package j8;

import android.os.Bundle;
import com.google.firebase.messaging.n0;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class a {
    public static Bundle a(n0 n0Var) {
        Map mapF = n0Var.f();
        Bundle bundle = new Bundle();
        if (mapF == null) {
            return bundle;
        }
        for (Map.Entry entry : mapF.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }
}
