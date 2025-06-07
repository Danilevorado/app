package w9;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes2.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    private x8.a f28082a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f28083b = c9.a.b();

    m(x8.a aVar) {
        this.f28082a = aVar;
    }

    private static Intent a() {
        String strD = c9.a.a().d();
        PackageManager packageManagerG = c9.a.e().g();
        Intent launchIntentForPackage = packageManagerG == null ? null : packageManagerG.getLaunchIntentForPackage(strD);
        if (launchIntentForPackage == null) {
            throw new ActivityNotFoundException();
        }
        launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        launchIntentForPackage.setFlags(872415232);
        return launchIntentForPackage;
    }

    void b(Bundle bundle) {
        Iterator itA = this.f28082a.a();
        while (itA.hasNext()) {
            ((ba.b) itA.next()).a(bundle);
        }
    }

    void c(d dVar) {
        boolean z10;
        Bundle bundle = new Bundle();
        bundle.putString("PUSH_RECEIVE_EVENT", dVar.w().toString());
        Intent intent = new Intent();
        String str = c9.a.a().d() + ".MESSAGE";
        intent.setAction(str);
        intent.setFlags(872415232);
        intent.putExtras(bundle);
        try {
            Context context = this.f28083b;
            if (context != null) {
                context.startActivity(intent);
            }
            z10 = false;
        } catch (ActivityNotFoundException unused) {
            z10 = true;
            k9.h.w("Can't launch activity. Are you sure you have an activity with '" + str + "' action in your manifest? Launching default activity.");
        }
        if (z10) {
            try {
                Intent intentA = a();
                intentA.putExtras(bundle);
                this.f28083b.startActivity(intentA);
            } catch (ActivityNotFoundException e5) {
                k9.h.n("Failed to start default launch activity.", e5);
            }
        }
    }

    boolean d(Bundle bundle) throws PendingIntent.CanceledException {
        String strX = g8.e.x(bundle);
        if (!TextUtils.isEmpty(strX) && this.f28083b != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strX));
                if (intent.resolveActivity(this.f28083b.getPackageManager()) == null) {
                    return false;
                }
                intent.addFlags(272629760);
                PendingIntent.getActivity(this.f28083b, 0, intent, k9.i.a(0)).send();
                return true;
            } catch (Exception e5) {
                k9.h.o(e5);
            }
        }
        return false;
    }
}
