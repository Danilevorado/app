package x9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import k9.h;

/* loaded from: classes2.dex */
abstract class c {
    static int a(Context context) {
        return context.getApplicationInfo().icon;
    }

    static Icon b(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (context == null || (applicationInfo = context.getApplicationInfo()) == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return c(context.getPackageManager(), str);
        }
        try {
            return Icon.createWithResource(context, applicationInfo.icon);
        } catch (Exception e5) {
            h.n("Failed creation of icon", e5);
            return null;
        }
    }

    private static Icon c(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        try {
            Drawable applicationIcon = packageManager.getApplicationIcon(str);
            if (applicationIcon instanceof BitmapDrawable) {
                return Icon.createWithBitmap(((BitmapDrawable) applicationIcon).getBitmap());
            }
            if (!(applicationIcon instanceof AdaptiveIconDrawable)) {
                return null;
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{((AdaptiveIconDrawable) applicationIcon).getForeground()});
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            layerDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            layerDrawable.draw(canvas);
            return Icon.createWithAdaptiveBitmap(bitmapCreateBitmap);
        } catch (PackageManager.NameNotFoundException e5) {
            h.n("Failed to create icon", e5);
            return null;
        }
    }
}
