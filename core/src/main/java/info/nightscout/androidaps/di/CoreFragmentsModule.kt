package info.nightscout.androidaps.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import info.nightscout.androidaps.activities.BolusProgressHelperActivity
import info.nightscout.androidaps.activities.ErrorHelperActivity
import info.nightscout.androidaps.activities.TDDStatsActivity
import info.nightscout.androidaps.dialogs.BolusProgressDialog
import info.nightscout.androidaps.dialogs.ErrorDialog
import info.nightscout.androidaps.dialogs.ProfileViewerDialog
import info.nightscout.androidaps.plugins.general.maintenance.activities.PrefImportListActivity
import info.nightscout.androidaps.utils.ui.SingleClickButton

@Module
@Suppress("unused")
abstract class CoreFragmentsModule {

    @ContributesAndroidInjector abstract fun contributesPrefImportListActivity(): PrefImportListActivity
    @ContributesAndroidInjector abstract fun contributesTDDStatsActivity(): TDDStatsActivity
    @ContributesAndroidInjector abstract fun contributeBolusProgressHelperActivity(): BolusProgressHelperActivity
    @ContributesAndroidInjector abstract fun contributeErrorHelperActivity(): ErrorHelperActivity

    @ContributesAndroidInjector abstract fun contributesBolusProgressDialog(): BolusProgressDialog
    @ContributesAndroidInjector abstract fun contributesErrorDialog(): ErrorDialog
    @ContributesAndroidInjector abstract fun contributesProfileViewerDialog(): ProfileViewerDialog

    @ContributesAndroidInjector abstract fun contributesSingleClickButton(): SingleClickButton

}
