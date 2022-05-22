package wolf.shin.navigationfragment.wolf.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import wolf.shin.navigationfragment.wolf.base.BaseFragment
import wolf.shin.navigationfragment.databinding.FragmentBlankBinding

class BlankFragment : BaseFragment<FragmentBlankBinding, BlankViewModel>() {
    override val viewModel: BlankViewModel get() = ViewModelProvider(this)[BlankViewModel::class.java]

    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentBlankBinding {
        return FragmentBlankBinding.inflate(layoutInflater)
    }

    override fun initView() {}

    override fun initData() {}

    override fun initListener() {}

    override fun initObserver() {}
}