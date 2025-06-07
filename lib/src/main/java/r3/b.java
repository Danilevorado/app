package r3;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.jv;
import com.google.android.gms.internal.ads.ze0;
import d3.m;

/* loaded from: classes.dex */
public class b extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    private m f26543m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26544n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView.ScaleType f26545o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f26546p;

    /* renamed from: q, reason: collision with root package name */
    private g f26547q;

    /* renamed from: r, reason: collision with root package name */
    private h f26548r;

    public b(Context context) {
        super(context);
    }

    protected final synchronized void a(g gVar) {
        this.f26547q = gVar;
        if (this.f26544n) {
            gVar.f26567a.b(this.f26543m);
        }
    }

    protected final synchronized void b(h hVar) {
        this.f26548r = hVar;
        if (this.f26546p) {
            hVar.f26568a.c(this.f26545o);
        }
    }

    public m getMediaContent() {
        return this.f26543m;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f26546p = true;
        this.f26545o = scaleType;
        h hVar = this.f26548r;
        if (hVar != null) {
            hVar.f26568a.c(scaleType);
        }
    }

    public void setMediaContent(m mVar) {
        boolean zK0;
        this.f26544n = true;
        this.f26543m = mVar;
        g gVar = this.f26547q;
        if (gVar != null) {
            gVar.f26567a.b(mVar);
        }
        if (mVar == null) {
            return;
        }
        try {
            jv jvVarA = mVar.a();
            if (jvVarA != null) {
                if (!mVar.c()) {
                    if (mVar.b()) {
                        zK0 = jvVarA.k0(l4.b.p1(this));
                    }
                    removeAllViews();
                }
                zK0 = jvVarA.H0(l4.b.p1(this));
                if (zK0) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e5) {
            removeAllViews();
            ze0.e("", e5);
        }
    }
}
