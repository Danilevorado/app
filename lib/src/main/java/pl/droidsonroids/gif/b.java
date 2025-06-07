package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.MediaController;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class b extends Drawable implements Animatable, MediaController.MediaPlayerControl {
    private final Rect A;
    ScheduledFuture B;
    private int C;
    private int D;
    private cc.a E;

    /* renamed from: m, reason: collision with root package name */
    final ScheduledThreadPoolExecutor f25971m;

    /* renamed from: n, reason: collision with root package name */
    volatile boolean f25972n;

    /* renamed from: o, reason: collision with root package name */
    long f25973o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f25974p;

    /* renamed from: q, reason: collision with root package name */
    protected final Paint f25975q;

    /* renamed from: r, reason: collision with root package name */
    final Bitmap f25976r;

    /* renamed from: s, reason: collision with root package name */
    final GifInfoHandle f25977s;

    /* renamed from: t, reason: collision with root package name */
    final ConcurrentLinkedQueue f25978t;

    /* renamed from: u, reason: collision with root package name */
    private ColorStateList f25979u;

    /* renamed from: v, reason: collision with root package name */
    private PorterDuffColorFilter f25980v;

    /* renamed from: w, reason: collision with root package name */
    private PorterDuff.Mode f25981w;

    /* renamed from: x, reason: collision with root package name */
    final boolean f25982x;

    /* renamed from: y, reason: collision with root package name */
    final g f25983y;

    /* renamed from: z, reason: collision with root package name */
    private final j f25984z;

    class a extends k {
        a(b bVar) {
            super(bVar);
        }

        @Override // pl.droidsonroids.gif.k
        public void a() {
            if (b.this.f25977s.r()) {
                b.this.start();
            }
        }
    }

    /* renamed from: pl.droidsonroids.gif.b$b, reason: collision with other inner class name */
    class C0175b extends k {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f25986n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0175b(b bVar, int i10) {
            super(bVar);
            this.f25986n = i10;
        }

        @Override // pl.droidsonroids.gif.k
        public void a() {
            b bVar = b.this;
            bVar.f25977s.v(this.f25986n, bVar.f25976r);
            this.f26015m.f25983y.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    public b(ContentResolver contentResolver, Uri uri) {
        this(GifInfoHandle.o(contentResolver, uri), null, null, true);
    }

    public b(AssetFileDescriptor assetFileDescriptor) {
        this(new GifInfoHandle(assetFileDescriptor), null, null, true);
    }

    public b(Resources resources, int i10) {
        this(resources.openRawResourceFd(i10));
        float fB = f.b(resources, i10);
        this.D = (int) (this.f25977s.e() * fB);
        this.C = (int) (this.f25977s.k() * fB);
    }

    b(GifInfoHandle gifInfoHandle, b bVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z10) {
        this.f25972n = true;
        this.f25973o = Long.MIN_VALUE;
        this.f25974p = new Rect();
        this.f25975q = new Paint(6);
        this.f25978t = new ConcurrentLinkedQueue();
        j jVar = new j(this);
        this.f25984z = jVar;
        this.f25982x = z10;
        this.f25971m = scheduledThreadPoolExecutor == null ? d.a() : scheduledThreadPoolExecutor;
        this.f25977s = gifInfoHandle;
        Bitmap bitmap = null;
        if (bVar != null) {
            synchronized (bVar.f25977s) {
                if (!bVar.f25977s.m() && bVar.f25977s.e() >= gifInfoHandle.e() && bVar.f25977s.k() >= gifInfoHandle.k()) {
                    bVar.i();
                    Bitmap bitmap2 = bVar.f25976r;
                    bitmap2.eraseColor(0);
                    bitmap = bitmap2;
                }
            }
        }
        if (bitmap == null) {
            this.f25976r = Bitmap.createBitmap(gifInfoHandle.k(), gifInfoHandle.e(), Bitmap.Config.ARGB_8888);
        } else {
            this.f25976r = bitmap;
        }
        this.f25976r.setHasAlpha(!gifInfoHandle.l());
        this.A = new Rect(0, 0, gifInfoHandle.k(), gifInfoHandle.e());
        this.f25983y = new g(this);
        jVar.a();
        this.C = gifInfoHandle.k();
        this.D = gifInfoHandle.e();
    }

    private void a() {
        ScheduledFuture scheduledFuture = this.B;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f25983y.removeMessages(-1);
    }

    private void g() {
        if (this.f25982x && this.f25972n) {
            long j10 = this.f25973o;
            if (j10 != Long.MIN_VALUE) {
                long jMax = Math.max(0L, j10 - SystemClock.uptimeMillis());
                this.f25973o = Long.MIN_VALUE;
                this.f25971m.remove(this.f25984z);
                this.B = this.f25971m.schedule(this.f25984z, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    private void i() {
        this.f25972n = false;
        this.f25983y.removeMessages(-1);
        this.f25977s.p();
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public int b() {
        return this.f25977s.a();
    }

    public int c() {
        int iB = this.f25977s.b();
        return (iB == 0 || iB < this.f25977s.f()) ? iB : iB - 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return d() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return d() > 1;
    }

    public int d() {
        return this.f25977s.i();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        if (this.f25980v == null || this.f25975q.getColorFilter() != null) {
            z10 = false;
        } else {
            this.f25975q.setColorFilter(this.f25980v);
            z10 = true;
        }
        cc.a aVar = this.E;
        if (aVar == null) {
            canvas.drawBitmap(this.f25976r, this.A, this.f25974p, this.f25975q);
        } else {
            aVar.a(canvas, this.f25975q, this.f25976r);
        }
        if (z10) {
            this.f25975q.setColorFilter(null);
        }
    }

    public boolean e() {
        return this.f25977s.m();
    }

    public void f() {
        this.f25971m.execute(new a(this));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f25975q.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f25975q.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return this.f25977s.c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return this.f25977s.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.D;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.C;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (!this.f25977s.l() || this.f25975q.getAlpha() < 255) ? -2 : -1;
    }

    public void h(int i10) {
        this.f25977s.w(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        g();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.f25972n;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f25972n;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.f25979u) != null && colorStateList.isStateful());
    }

    void j(long j10) {
        if (this.f25982x) {
            this.f25973o = 0L;
            this.f25983y.sendEmptyMessageAtTime(-1, 0L);
        } else {
            a();
            this.B = this.f25971m.schedule(this.f25984z, Math.max(j10, 0L), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f25974p.set(rect);
        cc.a aVar = this.E;
        if (aVar != null) {
            aVar.b(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f25979u;
        if (colorStateList == null || (mode = this.f25981w) == null) {
            return false;
        }
        this.f25980v = k(colorStateList, mode);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f25971m.execute(new C0175b(this, i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f25975q.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25975q.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f25975q.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f25975q.setFilterBitmap(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f25979u = colorStateList;
        this.f25980v = k(colorStateList, this.f25981w);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f25981w = mode;
        this.f25980v = k(this.f25979u, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (!this.f25982x) {
            if (z10) {
                if (z11) {
                    f();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
        synchronized (this) {
            if (this.f25972n) {
                return;
            }
            this.f25972n = true;
            j(this.f25977s.s());
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        synchronized (this) {
            if (this.f25972n) {
                this.f25972n = false;
                a();
                this.f25977s.u();
            }
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.f25977s.k()), Integer.valueOf(this.f25977s.e()), Integer.valueOf(this.f25977s.i()), Integer.valueOf(this.f25977s.g()));
    }
}
