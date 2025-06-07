package z0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class r {

    /* renamed from: b, reason: collision with root package name */
    public View f28739b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f28738a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f28740c = new ArrayList();

    public r(View view) {
        this.f28739b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f28739b == rVar.f28739b && this.f28738a.equals(rVar.f28738a);
    }

    public int hashCode() {
        return (this.f28739b.hashCode() * 31) + this.f28738a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f28739b + "\n") + "    values:";
        for (String str2 : this.f28738a.keySet()) {
            str = str + "    " + str2 + ": " + this.f28738a.get(str2) + "\n";
        }
        return str;
    }
}
