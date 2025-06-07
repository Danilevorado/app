package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Shader f2162a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f2163b;

    /* renamed from: c, reason: collision with root package name */
    private int f2164c;

    private d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f2162a = shader;
        this.f2163b = colorStateList;
        this.f2164c = i10;
    }

    private static d a(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(f.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(int i10) {
        return new d(null, null, i10);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e5) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e5);
            return null;
        }
    }

    public int e() {
        return this.f2164c;
    }

    public Shader f() {
        return this.f2162a;
    }

    public boolean h() {
        return this.f2162a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f2162a == null && (colorStateList = this.f2163b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f2163b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2164c) {
                this.f2164c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i10) {
        this.f2164c = i10;
    }

    public boolean l() {
        return h() || this.f2164c != 0;
    }
}
