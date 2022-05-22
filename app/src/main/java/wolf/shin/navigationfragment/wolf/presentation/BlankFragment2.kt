package wolf.shin.navigationfragment.wolf.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import wolf.shin.navigationfragment.wolf.base.BaseFragment
import wolf.shin.navigationfragment.databinding.FragmentBlank2Binding

class BlankFragment2 : BaseFragment<FragmentBlank2Binding, Blank2ViewModel>() {
    override val viewModel: Blank2ViewModel get() = ViewModelProvider(this)[Blank2ViewModel::class.java]

    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentBlank2Binding {
        return FragmentBlank2Binding.inflate(layoutInflater)
    }

    override fun initView() {}

    override fun initData() {}

    override fun initListener() {}

    override fun initObserver() {}
}