package {{ cookiecutter.package_name }}.features.start

import android.os.Bundle
import {{ cookiecutter.package_name }}.R
import {{ cookiecutter.package_name }}.base.BaseActivity
import {{ cookiecutter.package_name }}.features.start.ui.main.MainViewModel
import timber.log.Timber

class MainActivity : BaseActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        viewModel = viewModel()

        Timber.d("hallo log")
    }
}
