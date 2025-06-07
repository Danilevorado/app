package h3;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class b extends Thread {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Map f24071m;

    b(a aVar, Map map) {
        this.f24071m = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f24071m;
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        d.a(builderBuildUpon.build().toString());
    }
}
