package wolf.shin.navigationfragment.wolf.presentation.screen1.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import wolf.shin.navigationfragment.databinding.FragmentFirstDetailBinding
import wolf.shin.navigationfragment.wolf.base.BaseFragment
import wolf.shin.navigationfragment.wolf.presentation.screen3.detail.ThirdDetailViewModel

class FirstDetailFragment : BaseFragment<FragmentFirstDetailBinding, ThirdDetailViewModel>() {
    override val viewModel: ThirdDetailViewModel get() = ViewModelProvider(this)[ThirdDetailViewModel::class.java]

    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentFirstDetailBinding {
        return FragmentFirstDetailBinding.inflate(layoutInflater)
    }

    override fun initView() {}
}