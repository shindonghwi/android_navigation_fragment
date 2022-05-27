package wolf.shin.navigationfragment.wolf.presentation.screen1.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import wolf.shin.navigationfragment.databinding.FragmentFirstDetailBinding
import wolf.shin.navigationfragment.wolf.base.BaseFragment
import wolf.shin.navigationfragment.wolf.presentation.screen2.detail.SecondDetailViewModel

class FirstDetailFragment : BaseFragment<FragmentFirstDetailBinding, SecondDetailViewModel>() {
    override val viewModel: SecondDetailViewModel get() = ViewModelProvider(this)[SecondDetailViewModel::class.java]

    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentFirstDetailBinding {
        return FragmentFirstDetailBinding.inflate(layoutInflater)
    }

    override fun initView() {}
}