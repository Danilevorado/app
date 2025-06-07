package i8;

import com.google.firebase.messaging.n0;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class a {
    public static boolean a(n0 n0Var) {
        Map mapF = n0Var.f();
        return mapF != null && mapF.containsKey("pw_msg");
    }
}
