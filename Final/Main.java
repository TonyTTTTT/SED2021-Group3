import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(args[0])));

    while (true) {
      try {
        String line = bufferedReader.readLine();
        if (line == null) break;
        if (line.equals("")) continue;

        String[] lines = line.split(" ");
        switch (lines[0]) {
          case "student":
            handleStudentAdd(lines);
            break;
          case "schoolStrategy":
            handleSchoolStrategy(lines);
            break;
          case "designCriterion":
            handleDesignCriterion(lines);
            break;
          case "assignment":
            handleAssignment(lines);
            break;
          case "printRubric":
            handlePrintRubric(lines);
            break;
          case "calculateScore":
            handleCalculateScore(lines);
            break;
          case "averageCriterion":
            handleAverageCriterion(lines);
            break;
          case "findStrength":
            handleFindStrength(lines);
            break;
          case "findWeakness":
            handleFindWeakness(lines);
            break;
          default:
            badInput();
        }
      } catch (Exception e) {
        badInput();
        continue;
      }
    }

    bufferedReader.close();
  }

  private static void badInput() {
    System.out.println("BadInput");
  }

  //student [StudentID] [StudentID] …
  private static void handleStudentAdd(String[] lines) {
    if(lines.length < 2) badInput();

    System.out.println("StudentAdd");
    ArrayList<String> StudentIDs = new ArrayList<String>();

    for (int i = 1; i < lines.length; i++) {
      StudentIDs.add(lines[i]);
    }
  }

  // schoolStrategy [Level],[Score] [Level]...
  private static void handleSchoolStrategy(String[] lines) {
    if(lines.length < 2) badInput();

    System.out.println("SchoolStrategy");
    Map<String, Integer> Strategies = new HashMap<>();
    for (int i = 1; i < lines.length; i++) {
      String[] ss = lines[i].split(",");
      System.out.println(ss[0]);
      Strategies.put(ss[0], Integer.valueOf(ss[1]));
    }
  }

  // assignment [AssignmentID] [StudentID] [ReviewrID],[SampleScoreFile] [ReviewrID],[Sa
  private static void handleAssignment(String[] lines) {
    if(lines.length < 3) badInput();

    System.out.println(lines[0]);
    Map<String, String> DesignCriterion = new HashMap<>();
    String AssignmentId, CriteriaFilename;
    AssignmentId = lines[1];
    CriteriaFilename = lines[2];
    DesignCriterion.put(AssignmentId, CriteriaFilename);
  }

  // designCriterion [AssignmentID] [RubricFile]
  private static void handleDesignCriterion(String[] lines) {
    if(lines.length != 3) badInput();

    System.out.println(lines[0]);
    Map<String, Map<String, String>> AssignmentReviewers = new HashMap<>();
    Map<String, String> assignmentHash = new HashMap<>();
    String assignmentId = lines[1];
    String studentId = lines[2];

    for (int i = 3; i < lines.length; i++) {
      String[] reviews = lines[i].split(",");
      String reviewStudentId = reviews[0];
      String reviewScoreFilename = reviews[1];
      assignmentHash.put(reviewStudentId, reviewScoreFilename);
    }
  }

  // printRubric [AssignmentID]
  private static void handlePrintRubric(String[] lines) {
    if(lines.length != 2) badInput();
    System.out.println(lines[0]);
  }

  // calculateScore [AssignmentID] [StudentID] [RankingStrategy]
  private static void handleCalculateScore(String[] lines) {
    if(lines.length != 4) badInput();
    System.out.println(lines[0]);
  }

  // averageCriterion [AssignmentID]
  private static void handleAverageCriterion(String[] lines) {
    if(lines.length != 2) badInput();
    System.out.println(lines[0]);
  }

  // findStrength [AssignmentID] [StudentID] [RankingStrategy]
  private static void handleFindStrength(String[] lines) {
    if(lines.length != 4) badInput();

    System.out.println(lines[0]);
  }

  // findWeakness [AssignmentID] [StudentID] [RankingStrategy]
  private static void handleFindWeakness(String[] lines) {
    if(lines.length != 4) badInput();

    System.out.println(lines[0]);
  }
}
