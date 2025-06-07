package c2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import r1.h;
import r1.j;
import t1.v;

/* loaded from: classes.dex */
public class e implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4666a;

    public e(Context context) {
        this.f4666a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.f4666a.getPackageName())) {
            return this.f4666a;
        }
        try {
            return this.f4666a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e5) {
            if (str.contains(this.f4666a.getPackageName())) {
                return this.f4666a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e5);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e5) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e5);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // r1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(Uri uri, int i10, int i11, h hVar) {
        Context contextD = d(uri, uri.getAuthority());
        return d.e(b.b(this.f4666a, contextD, g(contextD, uri)));
    }

    @Override // r1.j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri, h hVar) {
        return uri.getScheme().equals("android.resource");
    }
}
