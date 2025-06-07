package androidx.work.impl;

/* loaded from: classes.dex */
class d0 extends r0.b {
    public d0() {
        super(15, 16);
    }

    @Override // r0.b
    public void a(u0.g gVar) {
        gVar.p("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        gVar.p("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        gVar.p("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        gVar.p("DROP TABLE `SystemIdInfo`");
        gVar.p("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
        s0.c.b(gVar, "SystemIdInfo");
    }
}
