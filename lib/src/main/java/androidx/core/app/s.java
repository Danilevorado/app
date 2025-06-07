package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s implements Iterable {

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList f2137m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    private final Context f2138n;

    public interface a {
        Intent p();
    }

    private s(Context context) {
        this.f2138n = context;
    }

    public static s i(Context context) {
        return new s(context);
    }

    public s e(Intent intent) {
        this.f2137m.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s f(Activity activity) {
        Intent intentP = activity instanceof a ? ((a) activity).p() : null;
        if (intentP == null) {
            intentP = j.a(activity);
        }
        if (intentP != null) {
            ComponentName component = intentP.getComponent();
            if (component == null) {
                component = intentP.resolveActivity(this.f2138n.getPackageManager());
            }
            h(component);
            e(intentP);
        }
        return this;
    }

    public s h(ComponentName componentName) {
        int size = this.f2137m.size();
        try {
            Context context = this.f2138n;
            while (true) {
                Intent intentB = j.b(context, componentName);
                if (intentB == null) {
                    return this;
                }
                this.f2137m.add(size, intentB);
                context = this.f2138n;
                componentName = intentB.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e5);
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f2137m.iterator();
    }

    public void k() {
        l(null);
    }

    public void l(Bundle bundle) {
        if (this.f2137m.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f2137m.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.k(this.f2138n, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f2138n.startActivity(intent);
    }
}
