[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/2tEd6OsF)
# GitHub Classroom Autograder Template for UAS Pemrograman Visual

This repository is a template for GitHub Classroom assignments with autograding.
Students are expected to **export their Flowgorithm solution to Java** and place the Java file as `src/Main.java`.

## Structure
- `.github/workflows/autograde.yml` - GitHub Actions workflow to compile and run autograder.
- `autograder/grade.py` - Simple autograder script that runs student program and compares outputs.
- `autograder/tests/` - Input and expected output files for each soal (soal1..soal5).
- `src/Main.java` - Placeholder. Students must replace with exported Java from Flowgorithm.

## Instructor setup (step-by-step)
1. Create a GitHub **Organization** (if you don't have one).
2. Create a new repository in the organization and mark it as a **Template repository**.
3. Upload this template (or import from ZIP).
4. In GitHub Classroom, create a new **Classroom** linked to your organization.
5. Create an **assignment** using this template repo.
   - Make it **Private**.
   - Choose Individual/Group as needed.
   - Set the deadline.
6. Distribute the invitation link to students.

## Student instructions (to include in assignment README or instructions.md)
1. Open Flowgorithm and complete the problem set.
2. Export your Flowgorithm flowchart to Java:
   - File -> Export -> Java
   - Save the exported Java file as `Main.java`
3. Place `Main.java` into the `src/` directory of your assignment repository (replace existing).
4. Commit and push your changes to GitHub.
5. The autograder will run automatically on push. Check GitHub Actions / assignment page for results.

## Notes and limitations
- The autograder expects **exact** output matching. Whitespace and line differences may cause failures.
- Flowgorithm `.fprg` files cannot be executed by the autograder directly; students **must export Java**.
- You can improve grade.py to be more tolerant (trim whitespace, allow numeric tolerances, etc.)

## Contact
If you want, I can:
- Customize grade.py to allow more flexible comparison.
- Convert the template to a ZIP for import.
- Create the Classroom assignment for you (requires access).
