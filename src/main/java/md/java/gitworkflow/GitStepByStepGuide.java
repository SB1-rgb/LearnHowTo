package md.java.gitworkflow;

public class GitStepByStepGuide {
    public static void main(String[] args) {
        String step1 = "Execute git stash command in order to save the changes";
        String step2 = "Go to the master branch - git checkout master";
        String step3 = "Get the latest changes - sync with origin/master git fetch";
        String step4 = "Download the diffs from origin/master to master local - git pull";
        String step5 = "Create a new dedicated branch for the task - git checkout -b Branch_name";
        String step6 = "Add code changes for implementing the required task";
        String step7 = "Save the changes on local memory-  git commit";
        String step8 = "Upload the changes on the cloud - git push";
        String step9 = "Go to the GitHub repository";
        String step10 = "Create a new pull request into the origin/master branch";
        String step11 = "Invite colaborators to review the code";
        String step12 = "Merge the code";
        String step12_1 = "If changes are required I have to modify my local branch and perform a git commit amend";
        String step12_2 = "After git commit amend we have to do a force git push-f";
        String step13 = "Delete the created the secondary branch as it is already merged";
        String step14 = "Go to the master IntellijIdea and checkout the master branch- git checkout master";
        String step15 = "Download the latest version of the origin/master- git fetch and git pull";
        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step12_1);
        System.out.println(step12_2);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
          }
}
