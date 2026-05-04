# 🎯 NeetCode Solutions Repository

> **@SOHAR-18** · Synced automatically from [NeetCode.io](https://neetcode.io)

---

## 📋 Table of Contents

- [About NeetCode](#about-neetcode)
- [Repository Overview](#repository-overview)
- [How GitHub Sync Works](#how-github-sync-works)
- [Repository Structure](#repository-structure)
- [Supported Languages](#supported-languages)
- [Getting Started](#getting-started)
- [Settings & Configuration](#settings--configuration)
- [Progress Tracking](#progress-tracking)
- [Tips for Success](#tips-for-success)
- [Resources](#resources)

---

## 🚀 About NeetCode

[NeetCode.io](https://neetcode.io) is a comprehensive coding interview preparation platform that provides:

- 📝 **Curated Problem Sets** — Handpicked DSA and coding interview problems
- 🎥 **Video Solutions** — Step-by-step walkthroughs for each problem
- 💻 **In-Browser Editor** — Write and test code directly in the platform
- 🔄 **GitHub Integration** — Automatically sync your solutions to GitHub
- 📊 **Progress Tracking** — Monitor your learning journey

---

## 📁 Repository Overview

This repository contains all your NeetCode problem solutions, automatically synced from the platform. Each submission is preserved in version control for easy reference and portfolio building.

**Repository:** `neetcode-submissions`  
**Owner:** @SOHAR-18

---

## 🔄 How GitHub Sync Works

### Connection Process

1. **Connect GitHub Account**
   - Visit [neetcode.io/profile/github](https://neetcode.io/profile/github)
   - Click "Connect GitHub" and authorize the integration
   - Authenticate with your GitHub credentials

2. **Enable Auto-Commit** (Optional)
   - Each submission on NeetCode can automatically push to this repository
   - Customizable by submission status (all or accepted only)

3. **Sync Options**

   | Option | Description |
   |--------|-------------|
   | **Auto-Commit** | Automatically push submissions when you solve problems |
   | **Bulk Sync** | Push all past solutions at once from GitHub settings |
   | **Manual Sync** | Sync individual submissions from the problem history panel |
   | **Individual Removal** | Remove specific submissions from GitHub if needed |

### Workflow

```
1. Solve problem on NeetCode.io
   ↓
2. Submit solution (auto-sync if enabled)
   ↓
3. Commit pushed to GitHub automatically
   ↓
4. Solution available in repository
```

---

## 📂 Repository Structure

Solutions are organized by **topic folder** → **problem ID** → **submission files**:

```
neetcode-submissions/
├── Arrays & Hashing/
│   ├── contains-duplicate/
│   │   ├── submission-0.py
│   │   └── submission-1.py
│   ├── two-integer-sum/
│   │   └── submission-0.ts
│   └── group-anagrams/
│       └── submission-0.java
├── Two Pointers/
│   ├── valid-palindrome/
│   │   └── submission-0.py
│   └── two-sum-ii-input-array-is-sorted/
│       └── submission-0.cpp
├── Sliding Window/
│   └── best-time-to-buy-and-sell-stock/
│       └── submission-0.go
├── Stack/
├── Binary Search/
├── Linked Lists/
├── Trees/
├── Graphs/
└── Dynamic Programming/
```

**File Naming Convention:**
- First submission: `submission-0.<ext>`
- Second submission: `submission-1.<ext>`
- And so on...

**Example Paths:**
```
Arrays & Hashing/contains-duplicate/submission-0.py
Two Pointers/valid-palindrome/submission-1.ts
Sliding Window/best-time-to-buy-and-sell-stock/submission-0.java
```

---

## 💻 Supported Languages

NeetCode supports solutions in multiple programming languages:

| Language | Extension | Popular For |
|----------|-----------|------------|
| Python | `.py` | Quick prototyping, interviews |
| JavaScript | `.js` | Web development interviews |
| TypeScript | `.ts` | Type-safe JS interviews |
| Java | `.java` | Enterprise interviews |
| C++ | `.cpp` | Competitive programming |
| C# | `.cs` | .NET ecosystem interviews |
| Go | `.go` | System design, backend |
| Rust | `.rs` | Systems programming |
| Kotlin | `.kt` | Android development |
| Swift | `.swift` | iOS development |
| SQL | `.sql` | Database interviews |

---

## 🎓 Getting Started

### 1. **Set Up Your Environment**

Clone this repository:
```bash
git clone https://github.com/SOHAR-18/neetcode-submissions.git
cd neetcode-submissions
```

### 2. **Review Your Solutions**

Navigate to topics and review your submissions:
```bash
cd "Arrays & Hashing"
cat contains-duplicate/submission-0.py
```

### 3. **Track Progress**

Use `git log` to see your solution history:
```bash
git log --oneline
```

### 4. **Study Efficiently**

- Review solutions with multiple attempts (submission-0, submission-1, etc.)
- Watch NeetCode video explanations alongside code
- Compare different language implementations
- Use this repo as a reference during interviews

---

## ⚙️ Settings & Configuration

Manage your sync preferences at **[neetcode.io/profile/github](https://neetcode.io/profile/github)**

### Available Settings

| Setting | Description |
|---------|-------------|
| **Auto-Commit Toggle** | Enable/disable automatic commits on submission |
| **Status Filter** | Sync all submissions or accepted only |
| **Repository Selection** | Choose which repo to sync to |
| **Bulk Sync** | Push all past solutions at once (rate-limited) |
| **Rename Repository** | Rename this repo or start with a new one |
| **Disconnect** | Revoke GitHub integration access |

### Recommended Configuration

```
✓ Auto-Commit: Enabled
✓ Status Filter: Accepted Only
✓ Repository: neetcode-submissions
```

---

## 📊 Progress Tracking

### Monitor Your Learning

**On NeetCode.io:**
- View completion percentage per topic
- Track time spent on each problem
- Review video solutions
- Access community discussions

**On GitHub:**
- Use commit history: `git log --stat`
- Count solutions by topic
- Review code evolution across submissions
- Build your portfolio

### Quick Stats Command

```bash
# Count total solutions
find . -name "submission-*.* -type f | wc -l

# Solutions by language
find . -name "submission-*.py" -type f | wc -l
find . -name "submission-*.ts" -type f | wc -l

# Recent solutions
git log --oneline -20
```

---

## 💡 Tips for Success

### 1. **Consistency is Key**
- Solve problems regularly (aim for 1-2 daily)
- Follow the NeetCode curriculum structure
- Don't skip topics

### 2. **Multiple Attempts**
- First attempt: Get it working
- Second attempt: Optimize for time complexity
- Third attempt: Optimize for space complexity

### 3. **Code Quality**
- Follow language conventions
- Use meaningful variable names
- Add comments for complex logic
- Keep solutions organized

### 4. **Active Recall**
- Solve without looking at hints first
- Watch video after solving
- Attempt again in different language
- Teach someone else the solution

### 5. **Interview Preparation**
- Practice explaining your solutions verbally
- Time yourself solving problems
- Practice whiteboarding equivalent
- Mock interview with friends

---

## 📚 Resources

### Official Resources
- **Platform:** [NeetCode.io](https://neetcode.io)
- **GitHub Integration:** [neetcode.io/profile/github](https://neetcode.io/profile/github)
- **Video Solutions:** All problems on NeetCode have video walkthroughs

### Complementary Learning
- **Big O Notation:** [Big O Cheat Sheet](https://www.bigocheatsheet.com/)
- **DS Visualization:** [VisuAlgo](https://visualgo.net/)
- **LeetCode:** [leetcode.com](https://leetcode.com) (additional practice)
- **GeeksforGeeks:** [GeeksforGeeks DSA](https://www.geeksforgeeks.org/data-structures/)

### Interview Prep
- System Design basics
- Behavioral questions preparation
- FAANG interview formats
- Salary negotiation

---

## 📈 Repository Statistics

| Category | Count |
|----------|-------|
| Total Topics | 15+ |
| Total Problems | 150+ |
| Languages | 11 |
| Last Updated | 2026-05-04 |

---

## 🤝 How to Use This Repository

### For Personal Review
```bash
# View all solutions in Arrays & Hashing
ls -la "Arrays & Hashing"/*/submission-*.py

# Check git history
git log --pretty=format:"%h - %s" | head -20
```

### For Portfolio/Interview
- Share specific problems solved
- Show multiple implementations
- Demonstrate problem-solving approach
- Highlight completed topics

### For Continued Learning
- Return to difficult problems
- Compare with new approaches
- Study advanced solutions
- Measure improvement over time

---

## 🔐 Privacy & License

This repository contains your personal solutions. Customize visibility:
- **Public:** Great for portfolio and learning
- **Private:** If company/interview guidelines require

---

## ✨ Key Features

✅ **Automatic Synchronization** — No manual uploads needed  
✅ **Multiple Submissions** — Track your problem-solving evolution  
✅ **Language Flexibility** — Code in your preferred language  
✅ **Version Control** — Full git history of all solutions  
✅ **Portfolio Ready** — Showcase your coding skills  
✅ **Interview Prep** — Complete problem coverage  

---

## 📞 Support & Feedback

- **Issues:** Report bugs or request features on [GitHub](https://github.com/SOHAR-18/neetcode-submissions/issues)
- **NeetCode Help:** Visit [neetcode.io](https://neetcode.io) support
- **Community:** Connect with other learners

---

## 📝 Notes

- Keep your GitHub profile public for portfolio purposes (optional)
- Regularly review old solutions to track progress
- Use this repo as motivation and reference
- Share with mentors or study groups for feedback

---

<div align="center">

**Happy Coding! 🚀**

*Consistency beats perfection. Solve one problem a day.*

[NeetCode.io](https://neetcode.io) | [GitHub](https://github.com/SOHAR-18) | [Updated: May 4, 2026]

</div>
