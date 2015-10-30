package com.kickstarter;

import com.kickstarter.libs.CurrentUser;
import com.kickstarter.libs.Money;
import com.kickstarter.services.gcm.MessageService;
import com.kickstarter.services.gcm.RegisterService;
import com.kickstarter.presenters.ActivityFeedPresenter;
import com.kickstarter.presenters.CommentFeedPresenter;
import com.kickstarter.presenters.DiscoveryFilterPresenter;
import com.kickstarter.presenters.DiscoveryPresenter;
import com.kickstarter.presenters.LoginPresenter;
import com.kickstarter.presenters.ProjectPresenter;
import com.kickstarter.presenters.SearchPresenter;
import com.kickstarter.presenters.ThanksPresenter;
import com.kickstarter.presenters.TwoFactorPresenter;
import com.kickstarter.presenters.ViewPledgePresenter;
import com.kickstarter.ui.activities.ActivityFeedActivity;
import com.kickstarter.ui.activities.CommentFeedActivity;
import com.kickstarter.ui.activities.DiscoveryActivity;
import com.kickstarter.ui.activities.ViewPledgeActivity;
import com.kickstarter.ui.viewholders.DiscoveryFilterViewHolder;
import com.kickstarter.ui.viewholders.EmptyActivityFeedViewHolder;
import com.kickstarter.ui.viewholders.EmptyCommentFeedViewHolder;
import com.kickstarter.ui.viewholders.ProjectContextViewHolder;
import com.kickstarter.ui.viewholders.CommentViewHolder;
import com.kickstarter.ui.activities.HelpActivity;
import com.kickstarter.ui.activities.ProjectActivity;
import com.kickstarter.ui.viewholders.ProjectViewHolder;
import com.kickstarter.ui.viewholders.RewardViewHolder;
import com.kickstarter.ui.views.CommentFeedToolbar;
import com.kickstarter.ui.viewholders.ProjectCardViewHolder;
import com.kickstarter.ui.viewholders.ProjectStateChangedPositiveViewHolder;
import com.kickstarter.ui.views.DiscoveryToolbar;
import com.kickstarter.ui.views.IconTextView;
import com.kickstarter.ui.views.KickstarterWebView;
import com.kickstarter.ui.views.ProjectActionToolbar;
import com.kickstarter.ui.views.TiemposTextView;

public interface ApplicationGraph {
  void inject(ActivityFeedActivity __);
  void inject(ActivityFeedPresenter __);
  void inject(CommentFeedActivity __);
  void inject(CommentFeedPresenter __);
  void inject(CommentFeedToolbar __);
  void inject(CommentViewHolder __);
  void inject(CurrentUser __);
  void inject(DiscoveryActivity __);
  void inject(DiscoveryFilterPresenter __);
  void inject(DiscoveryFilterViewHolder __);
  void inject(DiscoveryPresenter __);
  void inject(DiscoveryToolbar __);
  void inject(EmptyActivityFeedViewHolder __);
  void inject(EmptyCommentFeedViewHolder __);
  void inject(HelpActivity __);
  void inject(IconTextView __);
  void inject(KickstarterWebView __);
  void inject(KSApplication __);
  void inject(LoginPresenter __);
  void inject(MessageService __);
  void inject(Money __);
  void inject(ProjectActionToolbar __);
  void inject(ProjectContextViewHolder __);
  void inject(ProjectActivity __);
  void inject(ProjectPresenter __);
  void inject(ProjectCardViewHolder __);
  void inject(ProjectStateChangedPositiveViewHolder __);
  void inject(ProjectViewHolder __);
  void inject(RegisterService __);
  void inject(RewardViewHolder __);
  void inject(SearchPresenter __);
  void inject(ThanksPresenter __);
  void inject(TiemposTextView __);
  void inject(TwoFactorPresenter __);
  void inject(ViewPledgeActivity __);
  void inject(ViewPledgePresenter __);
}
